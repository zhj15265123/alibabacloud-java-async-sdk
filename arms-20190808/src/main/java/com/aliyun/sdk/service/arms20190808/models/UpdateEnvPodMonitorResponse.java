// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvPodMonitorResponse} extends {@link TeaModel}
 *
 * <p>UpdateEnvPodMonitorResponse</p>
 */
public class UpdateEnvPodMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEnvPodMonitorResponseBody body;

    private UpdateEnvPodMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateEnvPodMonitorResponse create() {
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
    public UpdateEnvPodMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEnvPodMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateEnvPodMonitorResponseBody body);

        @Override
        UpdateEnvPodMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEnvPodMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateEnvPodMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEnvPodMonitorResponse response) {
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
        public Builder body(UpdateEnvPodMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEnvPodMonitorResponse build() {
            return new UpdateEnvPodMonitorResponse(this);
        } 

    } 

}
