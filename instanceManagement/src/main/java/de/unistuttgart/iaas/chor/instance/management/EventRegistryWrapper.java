package de.unistuttgart.iaas.chor.instance.management;

import de.unistuttgart.iaas.chor.integration.event.registry.EventRegistry;

public class EventRegistryWrapper {
	private static EventRegistry eventRegistry;
	
	public static EventRegistry getRegistry() {
		return eventRegistry;
	}
	
	public static void initialize(EventRegistry eventRegistry) {
		EventRegistryWrapper.eventRegistry = eventRegistry;
	}	
}
