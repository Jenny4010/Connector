/*
 *  Copyright (c) 2022 Mercedes-Benz Tech Innovation GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Mercedes-Benz Tech Innovation GmbH - Initial API and Implementation
 *
 */

package org.eclipse.dataspaceconnector.core.security.hashicorpvault;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

class CreateEntryRequestPayloadOptions {

    private Integer cas;

    CreateEntryRequestPayloadOptions() {}

    public Integer getCas() {
        return this.cas;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        private final CreateEntryRequestPayloadOptions createEntryRequestPayloadOptions;

        private Builder() {
            createEntryRequestPayloadOptions = new CreateEntryRequestPayloadOptions();
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder cas(Integer cas) {
            createEntryRequestPayloadOptions.cas = cas;
            return this;
        }

        public CreateEntryRequestPayloadOptions build() {
            return createEntryRequestPayloadOptions;
        }
    }
}