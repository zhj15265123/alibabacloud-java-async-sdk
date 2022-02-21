// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVServerGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteVServerGroupResponse</p>
 */
public class DeleteVServerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVServerGroupResponseBody body;

    private DeleteVServerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVServerGroupResponse create() {
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
    public DeleteVServerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVServerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVServerGroupResponseBody body);

        @Override
        DeleteVServerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVServerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVServerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVServerGroupResponse response) {
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
        public Builder body(DeleteVServerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVServerGroupResponse build() {
            return new DeleteVServerGroupResponse(this);
        } 

    } 

}
