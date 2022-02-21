// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveAudioAuditNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveAudioAuditNotifyConfigResponse</p>
 */
public class DeleteLiveAudioAuditNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveAudioAuditNotifyConfigResponseBody body;

    private DeleteLiveAudioAuditNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveAudioAuditNotifyConfigResponse create() {
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
    public DeleteLiveAudioAuditNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveAudioAuditNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveAudioAuditNotifyConfigResponseBody body);

        @Override
        DeleteLiveAudioAuditNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveAudioAuditNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveAudioAuditNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveAudioAuditNotifyConfigResponse response) {
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
        public Builder body(DeleteLiveAudioAuditNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveAudioAuditNotifyConfigResponse build() {
            return new DeleteLiveAudioAuditNotifyConfigResponse(this);
        } 

    } 

}
