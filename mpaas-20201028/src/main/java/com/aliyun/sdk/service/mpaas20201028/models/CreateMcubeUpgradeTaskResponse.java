// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeUpgradeTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeUpgradeTaskResponse</p>
 */
public class CreateMcubeUpgradeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeUpgradeTaskResponseBody body;

    private CreateMcubeUpgradeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeUpgradeTaskResponse create() {
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
    public CreateMcubeUpgradeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeUpgradeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeUpgradeTaskResponseBody body);

        @Override
        CreateMcubeUpgradeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeUpgradeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeUpgradeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeUpgradeTaskResponse response) {
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
        public Builder body(CreateMcubeUpgradeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeUpgradeTaskResponse build() {
            return new CreateMcubeUpgradeTaskResponse(this);
        } 

    } 

}
