/**
 * Copyright (C) 2010-2011 Pierre-Yves Ricau (py.ricau at gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.androidannotations.processing.rest;

import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;

public class RestImplementationsHolder {

    private Map<Element, RestImplentationHolder> holders = new HashMap<Element, RestImplentationHolder>();

    public RestImplentationHolder create(Element element) {
    	RestImplentationHolder holder = new RestImplentationHolder();
        holders.put(element, holder);
        return holder;
    }

    public RestImplentationHolder getEnclosingHolder(Element enclosedElement) {
        Element activityElement = enclosedElement.getEnclosingElement();
        return holders.get(activityElement);
    }

    public RestImplentationHolder getRelativeHolder(Element element) {
        return holders.get(element);
    }

}