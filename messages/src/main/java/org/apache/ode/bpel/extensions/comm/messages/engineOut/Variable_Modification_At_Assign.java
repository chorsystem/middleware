package org.apache.ode.bpel.extensions.comm.messages.engineOut;

/**
 * This class extends the Variable_Modification message by the index of the copy
 * element of the Assign activity which modifies the variable.
 * 
 * @author hahnml
 */
public class Variable_Modification_At_Assign extends Variable_Modification {

	private static final long serialVersionUID = 6754756456L;

	private int numberOfCopyStatement;

	public Variable_Modification_At_Assign() {
		super();
	}

	public void setNumberOfCopyStatement(int numberOfCopyStatement) {
		this.numberOfCopyStatement = numberOfCopyStatement;
	}

	public int getNumberOfCopyStatement() {
		return numberOfCopyStatement;
	}
}
