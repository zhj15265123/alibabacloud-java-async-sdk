// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportPrometheusRulesResponse} extends {@link TeaModel}
 *
 * <p>ImportPrometheusRulesResponse</p>
 */
public class ImportPrometheusRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportPrometheusRulesResponseBody body;

    private ImportPrometheusRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportPrometheusRulesResponse create() {
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
    public ImportPrometheusRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportPrometheusRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportPrometheusRulesResponseBody body);

        @Override
        ImportPrometheusRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportPrometheusRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportPrometheusRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportPrometheusRulesResponse response) {
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
        public Builder body(ImportPrometheusRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportPrometheusRulesResponse build() {
            return new ImportPrometheusRulesResponse(this);
        } 

    } 

}
