// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPodLogsRequest} extends {@link RequestModel}
 *
 * <p>GetPodLogsRequest</p>
 */
public class GetPodLogsRequest extends Request {
    @Path
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Path
    @NameInMap("PodId")
    @Validation(required = true)
    private String podId;

    @Query
    @NameInMap("DownloadToFile")
    private Boolean downloadToFile;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MaxLines")
    private Integer maxLines;

    @Query
    @NameInMap("PodUid")
    private String podUid;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private GetPodLogsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.podId = builder.podId;
        this.downloadToFile = builder.downloadToFile;
        this.endTime = builder.endTime;
        this.maxLines = builder.maxLines;
        this.podUid = builder.podUid;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPodLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    /**
     * @return downloadToFile
     */
    public Boolean getDownloadToFile() {
        return this.downloadToFile;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxLines
     */
    public Integer getMaxLines() {
        return this.maxLines;
    }

    /**
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPodLogsRequest, Builder> {
        private String jobId; 
        private String podId; 
        private Boolean downloadToFile; 
        private String endTime; 
        private Integer maxLines; 
        private String podUid; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPodLogsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.podId = request.podId;
            this.downloadToFile = request.downloadToFile;
            this.endTime = request.endTime;
            this.maxLines = request.maxLines;
            this.podUid = request.podUid;
            this.startTime = request.startTime;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.putPathParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        /**
         * DownloadToFile.
         */
        public Builder downloadToFile(Boolean downloadToFile) {
            this.putQueryParameter("DownloadToFile", downloadToFile);
            this.downloadToFile = downloadToFile;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MaxLines.
         */
        public Builder maxLines(Integer maxLines) {
            this.putQueryParameter("MaxLines", maxLines);
            this.maxLines = maxLines;
            return this;
        }

        /**
         * PodUid.
         */
        public Builder podUid(String podUid) {
            this.putQueryParameter("PodUid", podUid);
            this.podUid = podUid;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPodLogsRequest build() {
            return new GetPodLogsRequest(this);
        } 

    } 

}
