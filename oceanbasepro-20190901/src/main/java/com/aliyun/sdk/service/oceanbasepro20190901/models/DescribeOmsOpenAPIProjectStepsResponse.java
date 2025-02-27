// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOmsOpenAPIProjectStepsResponse} extends {@link TeaModel}
 *
 * <p>DescribeOmsOpenAPIProjectStepsResponse</p>
 */
public class DescribeOmsOpenAPIProjectStepsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOmsOpenAPIProjectStepsResponseBody body;

    private DescribeOmsOpenAPIProjectStepsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeOmsOpenAPIProjectStepsResponse create() {
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
    public DescribeOmsOpenAPIProjectStepsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOmsOpenAPIProjectStepsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeOmsOpenAPIProjectStepsResponseBody body);

        @Override
        DescribeOmsOpenAPIProjectStepsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOmsOpenAPIProjectStepsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeOmsOpenAPIProjectStepsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOmsOpenAPIProjectStepsResponse response) {
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
        public Builder body(DescribeOmsOpenAPIProjectStepsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOmsOpenAPIProjectStepsResponse build() {
            return new DescribeOmsOpenAPIProjectStepsResponse(this);
        } 

    } 

}
