// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEduRoomResponse} extends {@link TeaModel}
 *
 * <p>DeleteEduRoomResponse</p>
 */
public class DeleteEduRoomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEduRoomResponseBody body;

    private DeleteEduRoomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEduRoomResponse create() {
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
    public DeleteEduRoomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEduRoomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEduRoomResponseBody body);

        @Override
        DeleteEduRoomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEduRoomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEduRoomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEduRoomResponse response) {
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
        public Builder body(DeleteEduRoomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEduRoomResponse build() {
            return new DeleteEduRoomResponse(this);
        } 

    } 

}
