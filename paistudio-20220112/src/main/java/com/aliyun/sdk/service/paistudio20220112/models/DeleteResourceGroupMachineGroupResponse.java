// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceGroupMachineGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourceGroupMachineGroupResponse</p>
 */
public class DeleteResourceGroupMachineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourceGroupMachineGroupResponseBody body;

    private DeleteResourceGroupMachineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourceGroupMachineGroupResponse create() {
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
    public DeleteResourceGroupMachineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourceGroupMachineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourceGroupMachineGroupResponseBody body);

        @Override
        DeleteResourceGroupMachineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourceGroupMachineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourceGroupMachineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourceGroupMachineGroupResponse response) {
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
        public Builder body(DeleteResourceGroupMachineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourceGroupMachineGroupResponse build() {
            return new DeleteResourceGroupMachineGroupResponse(this);
        } 

    } 

}
