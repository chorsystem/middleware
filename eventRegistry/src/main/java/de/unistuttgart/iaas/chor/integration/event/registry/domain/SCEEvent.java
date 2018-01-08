package de.unistuttgart.iaas.chor.integration.event.registry.domain;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * Entity class to persist all emitted events of a service composition engine.
 * This class is used as the basis for the definition of a hierarchy of
 * event entities. For example, to separate process events,
 * instance events or configuration events in different tables.
 * 
 * @author hahnml
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class SCEEvent {
	
	private SCEInstanceRef sceInstanceRef;
	
	private Long eventId;
	private String eventType;
	private Long eventMessageId;
	private Object eventMessage;
	private byte[] eventMessageByteArray;
	private Long timestamp;

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getEventId() {
		return eventId;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventMessageId(Long eventMessageId) {
		this.eventMessageId = eventMessageId;
	}

	public Long getEventMessageId() {
		return eventMessageId;
	}

	public void setEventMessage(Object eventMessage) {
		//Convert to ByteArray which can be mapped to database
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;
		try {
			out = new ObjectOutputStream(bos);
			out.writeObject(eventMessage);
			setEventMessageByteArray(bos.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
			    bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Transient
	public Object getEventMessage() {
		ByteArrayInputStream bis = new ByteArrayInputStream(eventMessageByteArray);
		ObjectInput in = null;

		Object eventMessage = null;
		try {
			in = new ObjectInputStream(bis);
			eventMessage = in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return eventMessage;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setSceInstanceRef(SCEInstanceRef sceInstanceRef) {
		this.sceInstanceRef = sceInstanceRef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sceInstanceID", referencedColumnName = "sceInstanceId")
	public SCEInstanceRef getSceInstanceRef() {
		return sceInstanceRef;
	}

	public void setEventMessageByteArray(byte[] eventMessageByteArray) {
		this.eventMessageByteArray = eventMessageByteArray;
	}

	public byte[] getEventMessageByteArray() {
		return eventMessageByteArray;
	}
}
