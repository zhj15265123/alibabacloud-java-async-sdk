// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkbenchEventResultResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkbenchEventResultResponse</p>
 */
public class UpdateWorkbenchEventResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkbenchEventResultResponseBody body;

    private UpdateWorkbenchEventResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateWorkbenchEventResultResponse create() {
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
    public UpdateWorkbenchEventResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkbenchEventResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateWorkbenchEventResultResponseBody body);

        @Override
        UpdateWorkbenchEventResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkbenchEventResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateWorkbenchEventResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkbenchEventResultResponse response) {
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
        public Builder body(UpdateWorkbenchEventResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkbenchEventResultResponse build() {
            return new UpdateWorkbenchEventResultResponse(this);
        } 

    } 

}
