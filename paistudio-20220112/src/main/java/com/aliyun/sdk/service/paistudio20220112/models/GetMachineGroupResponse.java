// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMachineGroupResponse} extends {@link TeaModel}
 *
 * <p>GetMachineGroupResponse</p>
 */
public class GetMachineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMachineGroupResponseBody body;

    private GetMachineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMachineGroupResponse create() {
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
    public GetMachineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMachineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMachineGroupResponseBody body);

        @Override
        GetMachineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMachineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMachineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMachineGroupResponse response) {
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
        public Builder body(GetMachineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMachineGroupResponse build() {
            return new GetMachineGroupResponse(this);
        } 

    } 

}
