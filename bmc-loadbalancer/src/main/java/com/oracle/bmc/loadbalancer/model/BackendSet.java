/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration of a load balancer backend set.
 * For more information on backend set configuration, see
 * [Managing Backend Sets](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managingbackendsets.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BackendSet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backends")
        private java.util.List<Backend> backends;

        public Builder backends(java.util.List<Backend> backends) {
            this.backends = backends;
            this.__explicitlySet__.add("backends");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
        private HealthChecker healthChecker;

        public Builder healthChecker(HealthChecker healthChecker) {
            this.healthChecker = healthChecker;
            this.__explicitlySet__.add("healthChecker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        public Builder policy(String policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionPersistenceConfiguration")
        private SessionPersistenceConfigurationDetails sessionPersistenceConfiguration;

        public Builder sessionPersistenceConfiguration(
                SessionPersistenceConfigurationDetails sessionPersistenceConfiguration) {
            this.sessionPersistenceConfiguration = sessionPersistenceConfiguration;
            this.__explicitlySet__.add("sessionPersistenceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfiguration sslConfiguration;

        public Builder sslConfiguration(SSLConfiguration sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            this.__explicitlySet__.add("sslConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendSet build() {
            BackendSet __instance__ =
                    new BackendSet(
                            backends,
                            healthChecker,
                            name,
                            policy,
                            sessionPersistenceConfiguration,
                            sslConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSet o) {
            return backends(o.getBackends())
                    .healthChecker(o.getHealthChecker())
                    .name(o.getName())
                    .policy(o.getPolicy())
                    .sessionPersistenceConfiguration(o.getSessionPersistenceConfiguration())
                    .sslConfiguration(o.getSslConfiguration());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backends")
    java.util.List<Backend> backends;

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
    HealthChecker healthChecker;

    /**
     * A friendly name for the backend set. It must be unique and it cannot be changed.
     * <p>
     * Valid backend set names include only alphanumeric characters, dashes, and underscores. Backend set names cannot
     * contain spaces. Avoid entering confidential information.
     * <p>
     * Example: `My_backend_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The load balancer policy for the backend set. The default load balancing policy is 'ROUND_ROBIN'
     * To get a list of available policies, use the {@link #listPolicies(ListPoliciesRequest) listPolicies}
     * operation.
     * <p>
     * Example: `LEAST_CONNECTIONS`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    String policy;

    @com.fasterxml.jackson.annotation.JsonProperty("sessionPersistenceConfiguration")
    SessionPersistenceConfigurationDetails sessionPersistenceConfiguration;

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfiguration sslConfiguration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
