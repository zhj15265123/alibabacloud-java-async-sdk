// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelNoticeV2Response} extends {@link TeaModel}
 *
 * <p>GetHotelNoticeV2Response</p>
 */
public class GetHotelNoticeV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelNoticeV2ResponseBody body;

    private GetHotelNoticeV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelNoticeV2Response create() {
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
    public GetHotelNoticeV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelNoticeV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelNoticeV2ResponseBody body);

        @Override
        GetHotelNoticeV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelNoticeV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelNoticeV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelNoticeV2Response response) {
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
        public Builder body(GetHotelNoticeV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelNoticeV2Response build() {
            return new GetHotelNoticeV2Response(this);
        } 

    } 

}
