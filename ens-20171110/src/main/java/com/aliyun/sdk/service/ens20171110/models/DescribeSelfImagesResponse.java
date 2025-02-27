// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSelfImagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSelfImagesResponse</p>
 */
public class DescribeSelfImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSelfImagesResponseBody body;

    private DescribeSelfImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSelfImagesResponse create() {
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
    public DescribeSelfImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSelfImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSelfImagesResponseBody body);

        @Override
        DescribeSelfImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSelfImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSelfImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSelfImagesResponse response) {
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
        public Builder body(DescribeSelfImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSelfImagesResponse build() {
            return new DescribeSelfImagesResponse(this);
        } 

    } 

}
