/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.config.facade.xml.mapping.attributes.mapping;

import javax.management.openmbean.OpenType;

public abstract class AbstractAttributeMappingStrategy<T, O extends OpenType<?>> implements
        AttributeMappingStrategy<T, O> {

    private final O attrOpenType;

    public AbstractAttributeMappingStrategy(final O attributeIfc) {
        this.attrOpenType = attributeIfc;
    }

    @Override
    public O getOpenType() {
        return attrOpenType;
    }

}
