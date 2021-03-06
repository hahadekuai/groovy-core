/*
 * Copyright 2003-2015 the original author or authors.
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
package gls.syntax

public class NumberLiteralTest extends gls.CompilableTestSupport {

    void testLargeNumbersOverflowing() {
        shouldCompile '''
            int a = 0x80000000
            a = 0x80000000i

            long longNumber = 0x8000000000000000L
            longNumber = 0x8000_0000_0000_0000L
            longNumber = 010_0000_0000_0000_0000_0000L
            longNumber = 0b1000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L
        '''
    }

}