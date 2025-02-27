// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskRequest} extends {@link RequestModel}
 *
 * <p>ResizeDiskRequest</p>
 */
public class ResizeDiskRequest extends Request {
    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("NewSize")
    @Validation(required = true)
    private String newSize;

    private ResizeDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.newSize = builder.newSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return newSize
     */
    public String getNewSize() {
        return this.newSize;
    }

    public static final class Builder extends Request.Builder<ResizeDiskRequest, Builder> {
        private String diskId; 
        private String newSize; 

        private Builder() {
            super();
        } 

        private Builder(ResizeDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.newSize = request.newSize;
        } 

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * NewSize.
         */
        public Builder newSize(String newSize) {
            this.putQueryParameter("NewSize", newSize);
            this.newSize = newSize;
            return this;
        }

        @Override
        public ResizeDiskRequest build() {
            return new ResizeDiskRequest(this);
        } 

    } 

}
