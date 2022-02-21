// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQueueConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateQueueConfigResponse</p>
 */
public class UpdateQueueConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQueueConfigResponseBody body;

    private UpdateQueueConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQueueConfigResponse create() {
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
    public UpdateQueueConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQueueConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQueueConfigResponseBody body);

        @Override
        UpdateQueueConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQueueConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQueueConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQueueConfigResponse response) {
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
        public Builder body(UpdateQueueConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQueueConfigResponse build() {
            return new UpdateQueueConfigResponse(this);
        } 

    } 

}
