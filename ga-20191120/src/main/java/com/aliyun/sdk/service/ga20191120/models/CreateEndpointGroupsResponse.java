// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEndpointGroupsResponse} extends {@link TeaModel}
 *
 * <p>CreateEndpointGroupsResponse</p>
 */
public class CreateEndpointGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEndpointGroupsResponseBody body;

    private CreateEndpointGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateEndpointGroupsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public CreateEndpointGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEndpointGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateEndpointGroupsResponseBody body);

        @Override
        CreateEndpointGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEndpointGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateEndpointGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEndpointGroupsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(CreateEndpointGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEndpointGroupsResponse build() {
            return new CreateEndpointGroupsResponse(this);
        } 

    } 

}
