// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupMonitoringAgentProcessResponse} extends {@link TeaModel}
 *
 * <p>ModifyGroupMonitoringAgentProcessResponse</p>
 */
public class ModifyGroupMonitoringAgentProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGroupMonitoringAgentProcessResponseBody body;

    private ModifyGroupMonitoringAgentProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyGroupMonitoringAgentProcessResponse create() {
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
    public ModifyGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGroupMonitoringAgentProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyGroupMonitoringAgentProcessResponseBody body);

        @Override
        ModifyGroupMonitoringAgentProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGroupMonitoringAgentProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyGroupMonitoringAgentProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGroupMonitoringAgentProcessResponse response) {
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
        public Builder body(ModifyGroupMonitoringAgentProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGroupMonitoringAgentProcessResponse build() {
            return new ModifyGroupMonitoringAgentProcessResponse(this);
        } 

    } 

}
