/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dubbo.admin.common.util;


import java.util.HashSet;
import java.util.Set;

public class Constants {

    public static final String REGISTRY_ADDRESS = "dubbo.registry.address";
    public static final String METADATA_ADDRESS = "dubbo.metadata-report.address";
    public static final String DEFAULT_ROOT = "dubbo";
    public static final String PATH_SEPARATOR = "/";
    public static final String GROUP_KEY = "group";
    public static final String CONFIG_KEY = "config";
    public static final String PROVIDER_SIDE = "provider";
    public static final String CONSUMER_SIDE = "consumer";
    public static final String CATEGORY_KEY = "category";
    public static final String ROUTERS_CATEGORY = "routers";
    public static final String CONDITION_ROUTE = "condition_route";
    public static final String CONFIGURATOR = "configurators";
    public static final String TAG_ROUTE = "tag_route";
    public static final String COMPATIBLE_CONFIG = "compatible_config";
    public static final String WEIGHT = "weight";
    public static final String BALANCING = "balancing";
    public static final String SERVICE = "service";
    public static final String APPLICATION = "application";
    public static final String PUNCTUATION_POINT = ".";
    public static final String PUNCTUATION_SEPARATOR_POINT = "\\.";
    public static final String INTERROGATION_POINT = "?";
    public static final String ANY_VALUE = "*";
    public static final String IP = "ip";
    public static final String INTERFACE_KEY = "interface";
    public static final String VERSION_KEY = "version";
    public static final String PROVIDERS_CATEGORY = "providers";
    public static final String CONSUMERS_CATEGORY = "consumers";
    public static final String SPECIFICATION_VERSION_KEY = "specVersion";
    public static final Set<String> CONFIGS = new HashSet<>();

    static {
        CONFIGS.add(WEIGHT);
        CONFIGS.add(BALANCING);
    }

}
