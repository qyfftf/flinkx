/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.flinkx.metadataphoenix5.entity;


import com.dtstack.metadata.rdb.core.entity.TableEntity;

/**
 * @company:www.dtstack.com
 * @Author:shiFang
 * @Date:2021-01-20 16:13
 * @Description:
 */
public class Phoenix5TableEntity extends TableEntity {

    /**表空间*/
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        return "Phoenix5TableEntity{" +
                "nameSpace='" + namespace + '\'' +
                ", tableName='" + tableName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", comment='" + comment + '\'' +
                ", totalSize=" + totalSize +
                ", rows=" + rows +
                '}';
    }
}
