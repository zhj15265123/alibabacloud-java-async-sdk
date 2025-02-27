// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAudioFileRequest} extends {@link RequestModel}
 *
 * <p>CreateAudioFileRequest</p>
 */
public class CreateAudioFileRequest extends Request {
    @Query
    @NameInMap("AudioFileName")
    @Validation(required = true)
    private String audioFileName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssFileKey")
    @Validation(required = true)
    private String ossFileKey;

    private CreateAudioFileRequest(Builder builder) {
        super(builder);
        this.audioFileName = builder.audioFileName;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.ossFileKey = builder.ossFileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAudioFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioFileName
     */
    public String getAudioFileName() {
        return this.audioFileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossFileKey
     */
    public String getOssFileKey() {
        return this.ossFileKey;
    }

    public static final class Builder extends Request.Builder<CreateAudioFileRequest, Builder> {
        private String audioFileName; 
        private String instanceId; 
        private String name; 
        private String ossFileKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateAudioFileRequest request) {
            super(request);
            this.audioFileName = request.audioFileName;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.ossFileKey = request.ossFileKey;
        } 

        /**
         * AudioFileName.
         */
        public Builder audioFileName(String audioFileName) {
            this.putQueryParameter("AudioFileName", audioFileName);
            this.audioFileName = audioFileName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssFileKey.
         */
        public Builder ossFileKey(String ossFileKey) {
            this.putQueryParameter("OssFileKey", ossFileKey);
            this.ossFileKey = ossFileKey;
            return this;
        }

        @Override
        public CreateAudioFileRequest build() {
            return new CreateAudioFileRequest(this);
        } 

    } 

}
