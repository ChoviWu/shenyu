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

package org.dromara.soul.admin.service;

import org.dromara.soul.register.common.dto.MetaDataRegisterDTO;

/**
 * The interface Soul client service.
 */
public interface SoulClientRegisterService {
    
    /**
     * Register spring mvc string.
     *
     * @param metaDataRegisterDTO the meta data register dto
     * @return the string
     */
    String registerSpringMvc(MetaDataRegisterDTO metaDataRegisterDTO);
    
    /**
     * Register spring cloud string.
     *
     * @param metaDataRegisterDTO the meta data register dto
     * @return the string
     */
    String registerSpringCloud(MetaDataRegisterDTO metaDataRegisterDTO);
    
    /**
     * Register dubbo string.
     *
     * @param metaDataRegisterDTO the meta data register dto
     * @return the string
     */
    String registerDubbo(MetaDataRegisterDTO metaDataRegisterDTO);
    
    /**
     * Register sofa string.
     *
     * @param metaDataRegisterDTO the meta data register dto
     * @return the string
     */
    String registerSofa(MetaDataRegisterDTO metaDataRegisterDTO);
    
    /**
     * Register tars string.
     *
     * @param metaDataRegisterDTO the meta data register dto
     * @return the string
     */
    String registerTars(MetaDataRegisterDTO metaDataRegisterDTO);
    
    /**
     * Register grpc string.
     *
     * @param metaDataRegisterDTO the meta data register dto
     * @return the string
     */
    String registerGrpc(MetaDataRegisterDTO metaDataRegisterDTO);
}
