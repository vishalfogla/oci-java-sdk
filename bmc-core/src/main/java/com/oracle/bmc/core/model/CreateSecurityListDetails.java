/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSecurityListDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateSecurityListDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
        private java.util.List<EgressSecurityRule> egressSecurityRules;

        public Builder egressSecurityRules(java.util.List<EgressSecurityRule> egressSecurityRules) {
            this.egressSecurityRules = egressSecurityRules;
            this.__explicitlySet__.add("egressSecurityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
        private java.util.List<IngressSecurityRule> ingressSecurityRules;

        public Builder ingressSecurityRules(
                java.util.List<IngressSecurityRule> ingressSecurityRules) {
            this.ingressSecurityRules = ingressSecurityRules;
            this.__explicitlySet__.add("ingressSecurityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSecurityListDetails build() {
            CreateSecurityListDetails __instance__ =
                    new CreateSecurityListDetails(
                            compartmentId,
                            displayName,
                            egressSecurityRules,
                            ingressSecurityRules,
                            vcnId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSecurityListDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .egressSecurityRules(o.getEgressSecurityRules())
                    .ingressSecurityRules(o.getIngressSecurityRules())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the security list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
    java.util.List<EgressSecurityRule> egressSecurityRules;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
    java.util.List<IngressSecurityRule> ingressSecurityRules;

    /**
     * The OCID of the VCN the security list belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
