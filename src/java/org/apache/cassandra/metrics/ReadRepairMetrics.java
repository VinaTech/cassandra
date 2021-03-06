package org.apache.cassandra.metrics;
/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Meter;

/**
 * Metrics related to Read Repair.
 */
public class ReadRepairMetrics {
    public static final String GROUP_NAME = "org.apache.cassandra.metrics";
    public static final String TYPE_NAME = "ReadRepair";
    
    public static final Meter repairedBlocking =
            CassandraMetricRegistry.get().meter(MetricRegistry.name(GROUP_NAME, TYPE_NAME, "RepairedBlocking"));
    public static final Meter repairedBackground =
            CassandraMetricRegistry.get().meter(MetricRegistry.name(GROUP_NAME, TYPE_NAME, "RepairedBackground"));
    public static final Meter attempted = 
            CassandraMetricRegistry.get().meter(MetricRegistry.name(GROUP_NAME, TYPE_NAME, "Attempted"));
}
