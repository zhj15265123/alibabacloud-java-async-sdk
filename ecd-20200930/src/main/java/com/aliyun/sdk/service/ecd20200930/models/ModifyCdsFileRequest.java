// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdsFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdsFileRequest</p>
 */
public class ModifyCdsFileRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("ConflictPolicy")
    private String conflictPolicy;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("FileName")
    @Validation(required = true, maxLength = 1024, minLength = 1)
    private String fileName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyCdsFileRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.conflictPolicy = builder.conflictPolicy;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdsFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return conflictPolicy
     */
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCdsFileRequest, Builder> {
        private String cdsId; 
        private String conflictPolicy; 
        private String endUserId; 
        private String fileId; 
        private String fileName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdsFileRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.conflictPolicy = request.conflictPolicy;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The processing method that is used if the file that you want to create has the same name as an existing file in the cloud. Valid values: ignore: allows you to create the file by using the same name as an existing file in the cloud. auto_rename: automatically renames the file that you want to create if a file that has the same name exists in the cloud. By default, the current point in time is added to the end of the file name. Example: xxx\_20060102\_150405. refuse: denies creating the file if a file that has the same name exists in the cloud. Default value: refuse.
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
            return this;
        }

        /**
         * The ID of the end user who uses the cloud disk.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The file name.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCdsFileRequest build() {
            return new ModifyCdsFileRequest(this);
        } 

    } 

}
