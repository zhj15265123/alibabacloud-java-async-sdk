// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallsV2DetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2DetailResponse</p>
 */
public class DescribeTrFirewallsV2DetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTrFirewallsV2DetailResponseBody body;

    private DescribeTrFirewallsV2DetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeTrFirewallsV2DetailResponse create() {
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
    public DescribeTrFirewallsV2DetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrFirewallsV2DetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeTrFirewallsV2DetailResponseBody body);

        @Override
        DescribeTrFirewallsV2DetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrFirewallsV2DetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeTrFirewallsV2DetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrFirewallsV2DetailResponse response) {
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
        public Builder body(DescribeTrFirewallsV2DetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTrFirewallsV2DetailResponse build() {
            return new DescribeTrFirewallsV2DetailResponse(this);
        } 

    } 

}
