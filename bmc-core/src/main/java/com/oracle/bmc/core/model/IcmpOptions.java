/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Optional object to specify a particular ICMP type and code. If you specify ICMP as the protocol
 * but do not provide this object, then all ICMP types and codes are allowed. If you do provide
 * this object, the type is required and the code is optional.
 * See [ICMP Parameters](http://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml)
 * for allowed values. To enable MTU negotiation for ingress internet traffic, make sure to allow
 * type 3 (\"Destination Unreachable\") code 4 (\"Fragmentation Needed and Don't Fragment was Set\").
 * If you need to specify multiple codes for a single type, create a separate security list rule for each.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IcmpOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class IcmpOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Integer code;

        public Builder code(Integer code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Integer type;

        public Builder type(Integer type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IcmpOptions build() {
            IcmpOptions __instance__ = new IcmpOptions(code, type);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IcmpOptions o) {
            return code(o.getCode()).type(o.getType());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The ICMP code (optional).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    Integer code;

    /**
     * The ICMP type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Integer type;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
