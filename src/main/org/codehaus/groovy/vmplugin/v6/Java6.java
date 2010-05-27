/*
 * Copyright 2003-2010 the original author or authors.
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

package org.codehaus.groovy.vmplugin.v6;

import org.codehaus.groovy.vmplugin.v5.Java5;

/**
 * Java 6 based functions
 *
 * @author Jochen Theodorou
 */
public class Java6 extends Java5 {
    private static final Class[] PLUGIN_DGM = {PluginDefaultGroovyMethods.class,
            org.codehaus.groovy.vmplugin.v5.PluginDefaultGroovyMethods.class};
    private static final Class[] STATIC_PLUGIN_DGM = {PluginStaticGroovyMethods.class};

    public Class[] getPluginDefaultGroovyMethods() {
        return PLUGIN_DGM;
    }

    public Class[] getPluginStaticGroovyMethods() {
        return STATIC_PLUGIN_DGM;
    }

}

