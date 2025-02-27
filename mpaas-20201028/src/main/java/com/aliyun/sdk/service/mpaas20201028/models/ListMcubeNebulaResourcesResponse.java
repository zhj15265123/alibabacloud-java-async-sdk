// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeNebulaResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListMcubeNebulaResourcesResponse</p>
 */
public class ListMcubeNebulaResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcubeNebulaResourcesResponseBody body;

    private ListMcubeNebulaResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcubeNebulaResourcesResponse create() {
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
     * @return body
     */
    public ListMcubeNebulaResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcubeNebulaResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcubeNebulaResourcesResponseBody body);

        @Override
        ListMcubeNebulaResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcubeNebulaResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcubeNebulaResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcubeNebulaResourcesResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(ListMcubeNebulaResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcubeNebulaResourcesResponse build() {
            return new ListMcubeNebulaResourcesResponse(this);
        } 

    } 

}
