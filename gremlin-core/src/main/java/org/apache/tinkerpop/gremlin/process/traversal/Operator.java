/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.process.traversal;

import java.util.Collection;
import java.util.function.BinaryOperator;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public enum Operator implements BinaryOperator<Object> {

    sum {
        public Object apply(final Object a, Object b) {
            return NumberHelper.add((Number) a, (Number) b);
        }
    },
    minus {
        public Object apply(final Object a, final Object b) {
            return NumberHelper.sub((Number) a, (Number) b);
        }
    },
    mult {
        public Object apply(final Object a, final Object b) {
            return NumberHelper.mul((Number) a, (Number) b);
        }
    },
    div {
        public Object apply(final Object a, final Object b) {
            return NumberHelper.div((Number) a, (Number) b);
        }
    },
    min {
        public Object apply(final Object a, final Object b) {
            return NumberHelper.min((Number) a, (Number) b);
        }
    },
    max {
        public Object apply(final Object a, final Object b) {
            return NumberHelper.max((Number) a, (Number) b);
        }
    },
    assign {
        public Object apply(final Object a, final Object b) {
            return b;
        }
    },
    and {
        public Object apply(final Object a, final Object b) {
            return ((boolean) a) && ((boolean) b);
        }
    },
    or {
        public Object apply(final Object a, final Object b) {
            return ((boolean) a) || ((boolean) b);
        }
    },
    add {
        public Object apply(final Object a, final Object b) {
            ((Collection) a).addAll((Collection) b);
            return a;
        }
    }
}
