/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListBucketsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The top-level namespace used for the request.
     */
    private String namespaceName;

    /**
     * The ID of the compartment in which to create the bucket.
     */
    private String compartmentId;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page at which to start retrieving results.
     */
    private String page;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListBucketsRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }

        /**
         * Build the instance of ListBucketsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListBucketsRequest
         */
        public ListBucketsRequest build() {
            ListBucketsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
