// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFileSystemRequest} extends {@link RequestModel}
 *
 * <p>ModifyFileSystemRequest</p>
 */
public class ModifyFileSystemRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    private ModifyFileSystemRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFileSystemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<ModifyFileSystemRequest, Builder> {
        private String description; 
        private String ensRegionId; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFileSystemRequest request) {
            super(request);
            this.description = request.description;
            this.ensRegionId = request.ensRegionId;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public ModifyFileSystemRequest build() {
            return new ModifyFileSystemRequest(this);
        } 

    } 

}
