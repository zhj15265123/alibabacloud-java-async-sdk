// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaMarksResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMediaMarksResponseBody</p>
 */
public class DeleteMediaMarksResponseBody extends TeaModel {
    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("MediaMarkIds")
    private String mediaMarkIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteMediaMarksResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.mediaMarkIds = builder.mediaMarkIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaMarksResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaMarkIds
     */
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mediaId; 
        private String mediaMarkIds; 
        private String requestId; 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaMarkIds.
         */
        public Builder mediaMarkIds(String mediaMarkIds) {
            this.mediaMarkIds = mediaMarkIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMediaMarksResponseBody build() {
            return new DeleteMediaMarksResponseBody(this);
        } 

    } 

}
