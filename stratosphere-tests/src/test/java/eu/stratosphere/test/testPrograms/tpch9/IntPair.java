/***********************************************************************************************************************
 * Copyright (C) 2010-2013 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 **********************************************************************************************************************/

package eu.stratosphere.test.testPrograms.tpch9;

import eu.stratosphere.types.PactInteger;
import eu.stratosphere.types.PactPair;

public class IntPair extends PactPair<PactInteger, PactInteger> {
	private static final long serialVersionUID = 1L;
	
	public IntPair() {
	}

	public IntPair(PactInteger first, PactInteger second) {
		super(first, second);
	}

	public IntPair(int first, int second) {
		super(new PactInteger(first), new PactInteger(second));
	}
}