/*
 * Copyright (C) 2020 The zfoo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.zfoo.protocol.buffer.model;


import com.zfoo.protocol.anno.Protocol;

import java.util.Objects;

/**
 * @author godotg
 * @version 3.0
 */
@Protocol(id = 3)
public class MyObjectB {

    public boolean a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObjectB myObjectB = (MyObjectB) o;
        return a == myObjectB.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}

