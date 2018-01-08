/* Copyright 2011 Dominik Muhler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.unistuttgart.iaas.chor.integration.management.registry;

import de.unistuttgart.iaas.chor.integration.management.registry.domain.SCEInstance;



/**
 * Static methods to check input parameters 
 * 
 * 
 * 
 */
public class Preconditions {

	public static boolean isNullOrEmpty(String string) {
		return string == null || string.isEmpty();
	}

	public static boolean check(SCEInstance instance) {
		return !isNullOrEmpty(instance.getSceInstanceId());
	}

	
	

}
