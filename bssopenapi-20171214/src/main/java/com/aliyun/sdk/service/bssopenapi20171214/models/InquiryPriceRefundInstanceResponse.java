// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InquiryPriceRefundInstanceResponse} extends {@link TeaModel}
 *
 * <p>InquiryPriceRefundInstanceResponse</p>
 */
public class InquiryPriceRefundInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private InquiryPriceRefundInstanceResponseBody body;

    private InquiryPriceRefundInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static InquiryPriceRefundInstanceResponse create() {
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
    public InquiryPriceRefundInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InquiryPriceRefundInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(InquiryPriceRefundInstanceResponseBody body);

        @Override
        InquiryPriceRefundInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InquiryPriceRefundInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private InquiryPriceRefundInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InquiryPriceRefundInstanceResponse response) {
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
        public Builder body(InquiryPriceRefundInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InquiryPriceRefundInstanceResponse build() {
            return new InquiryPriceRefundInstanceResponse(this);
        } 

    } 

}
