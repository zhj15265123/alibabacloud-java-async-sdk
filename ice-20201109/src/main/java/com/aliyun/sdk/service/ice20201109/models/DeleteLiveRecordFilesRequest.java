// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRecordFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveRecordFilesRequest</p>
 */
public class DeleteLiveRecordFilesRequest extends Request {
    @Query
    @NameInMap("RecordIds")
    @Validation(required = true)
    private java.util.List < String > recordIds;

    @Query
    @NameInMap("RemoveFile")
    private Boolean removeFile;

    private DeleteLiveRecordFilesRequest(Builder builder) {
        super(builder);
        this.recordIds = builder.recordIds;
        this.removeFile = builder.removeFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRecordFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordIds
     */
    public java.util.List < String > getRecordIds() {
        return this.recordIds;
    }

    /**
     * @return removeFile
     */
    public Boolean getRemoveFile() {
        return this.removeFile;
    }

    public static final class Builder extends Request.Builder<DeleteLiveRecordFilesRequest, Builder> {
        private java.util.List < String > recordIds; 
        private Boolean removeFile; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveRecordFilesRequest request) {
            super(request);
            this.recordIds = request.recordIds;
            this.removeFile = request.removeFile;
        } 

        /**
         * RecordIds.
         */
        public Builder recordIds(java.util.List < String > recordIds) {
            this.putQueryParameter("RecordIds", recordIds);
            this.recordIds = recordIds;
            return this;
        }

        /**
         * RemoveFile.
         */
        public Builder removeFile(Boolean removeFile) {
            this.putQueryParameter("RemoveFile", removeFile);
            this.removeFile = removeFile;
            return this;
        }

        @Override
        public DeleteLiveRecordFilesRequest build() {
            return new DeleteLiveRecordFilesRequest(this);
        } 

    } 

}
