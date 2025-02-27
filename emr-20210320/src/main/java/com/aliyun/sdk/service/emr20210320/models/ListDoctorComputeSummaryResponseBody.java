// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorComputeSummaryResponseBody</p>
 */
public class ListDoctorComputeSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDoctorComputeSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorComputeSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorComputeSummaryResponseBody build() {
            return new ListDoctorComputeSummaryResponseBody(this);
        } 

    } 

    public static class Analysis extends TeaModel {
        @NameInMap("HealthyJobCount")
        private Long healthyJobCount;

        @NameInMap("NeedAttentionJobCount")
        private Long needAttentionJobCount;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("ScoreDayGrowthRatio")
        private Float scoreDayGrowthRatio;

        @NameInMap("SubHealthyJobCount")
        private Long subHealthyJobCount;

        @NameInMap("UnhealthyJobCount")
        private Long unhealthyJobCount;

        private Analysis(Builder builder) {
            this.healthyJobCount = builder.healthyJobCount;
            this.needAttentionJobCount = builder.needAttentionJobCount;
            this.score = builder.score;
            this.scoreDayGrowthRatio = builder.scoreDayGrowthRatio;
            this.subHealthyJobCount = builder.subHealthyJobCount;
            this.unhealthyJobCount = builder.unhealthyJobCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return healthyJobCount
         */
        public Long getHealthyJobCount() {
            return this.healthyJobCount;
        }

        /**
         * @return needAttentionJobCount
         */
        public Long getNeedAttentionJobCount() {
            return this.needAttentionJobCount;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreDayGrowthRatio
         */
        public Float getScoreDayGrowthRatio() {
            return this.scoreDayGrowthRatio;
        }

        /**
         * @return subHealthyJobCount
         */
        public Long getSubHealthyJobCount() {
            return this.subHealthyJobCount;
        }

        /**
         * @return unhealthyJobCount
         */
        public Long getUnhealthyJobCount() {
            return this.unhealthyJobCount;
        }

        public static final class Builder {
            private Long healthyJobCount; 
            private Long needAttentionJobCount; 
            private Integer score; 
            private Float scoreDayGrowthRatio; 
            private Long subHealthyJobCount; 
            private Long unhealthyJobCount; 

            /**
             * HealthyJobCount.
             */
            public Builder healthyJobCount(Long healthyJobCount) {
                this.healthyJobCount = healthyJobCount;
                return this;
            }

            /**
             * NeedAttentionJobCount.
             */
            public Builder needAttentionJobCount(Long needAttentionJobCount) {
                this.needAttentionJobCount = needAttentionJobCount;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * ScoreDayGrowthRatio.
             */
            public Builder scoreDayGrowthRatio(Float scoreDayGrowthRatio) {
                this.scoreDayGrowthRatio = scoreDayGrowthRatio;
                return this;
            }

            /**
             * SubHealthyJobCount.
             */
            public Builder subHealthyJobCount(Long subHealthyJobCount) {
                this.subHealthyJobCount = subHealthyJobCount;
                return this;
            }

            /**
             * UnhealthyJobCount.
             */
            public Builder unhealthyJobCount(Long unhealthyJobCount) {
                this.unhealthyJobCount = unhealthyJobCount;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    public static class MemSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private MemSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemSeconds create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MemSeconds build() {
                return new MemSeconds(this);
            } 

        } 

    }
    public static class MemSecondsDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Float value;

        private MemSecondsDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemSecondsDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MemSecondsDayGrowthRatio build() {
                return new MemSecondsDayGrowthRatio(this);
            } 

        } 

    }
    public static class MemUtilization extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Float value;

        private MemUtilization(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemUtilization create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MemUtilization build() {
                return new MemUtilization(this);
            } 

        } 

    }
    public static class ReadSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private ReadSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ReadSize build() {
                return new ReadSize(this);
            } 

        } 

    }
    public static class VcoreSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private VcoreSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreSeconds create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public VcoreSeconds build() {
                return new VcoreSeconds(this);
            } 

        } 

    }
    public static class VcoreSecondsDayGrowthRatio extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Float value;

        private VcoreSecondsDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreSecondsDayGrowthRatio create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public VcoreSecondsDayGrowthRatio build() {
                return new VcoreSecondsDayGrowthRatio(this);
            } 

        } 

    }
    public static class VcoreUtilization extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Float value;

        private VcoreUtilization(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreUtilization create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public VcoreUtilization build() {
                return new VcoreUtilization(this);
            } 

        } 

    }
    public static class WriteSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private WriteSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WriteSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WriteSize build() {
                return new WriteSize(this);
            } 

        } 

    }
    public static class Metrics extends TeaModel {
        @NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @NameInMap("MemSecondsDayGrowthRatio")
        private MemSecondsDayGrowthRatio memSecondsDayGrowthRatio;

        @NameInMap("MemUtilization")
        private MemUtilization memUtilization;

        @NameInMap("ReadSize")
        private ReadSize readSize;

        @NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        @NameInMap("VcoreSecondsDayGrowthRatio")
        private VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio;

        @NameInMap("VcoreUtilization")
        private VcoreUtilization vcoreUtilization;

        @NameInMap("WriteSize")
        private WriteSize writeSize;

        private Metrics(Builder builder) {
            this.memSeconds = builder.memSeconds;
            this.memSecondsDayGrowthRatio = builder.memSecondsDayGrowthRatio;
            this.memUtilization = builder.memUtilization;
            this.readSize = builder.readSize;
            this.vcoreSeconds = builder.vcoreSeconds;
            this.vcoreSecondsDayGrowthRatio = builder.vcoreSecondsDayGrowthRatio;
            this.vcoreUtilization = builder.vcoreUtilization;
            this.writeSize = builder.writeSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return memSeconds
         */
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        /**
         * @return memSecondsDayGrowthRatio
         */
        public MemSecondsDayGrowthRatio getMemSecondsDayGrowthRatio() {
            return this.memSecondsDayGrowthRatio;
        }

        /**
         * @return memUtilization
         */
        public MemUtilization getMemUtilization() {
            return this.memUtilization;
        }

        /**
         * @return readSize
         */
        public ReadSize getReadSize() {
            return this.readSize;
        }

        /**
         * @return vcoreSeconds
         */
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        /**
         * @return vcoreSecondsDayGrowthRatio
         */
        public VcoreSecondsDayGrowthRatio getVcoreSecondsDayGrowthRatio() {
            return this.vcoreSecondsDayGrowthRatio;
        }

        /**
         * @return vcoreUtilization
         */
        public VcoreUtilization getVcoreUtilization() {
            return this.vcoreUtilization;
        }

        /**
         * @return writeSize
         */
        public WriteSize getWriteSize() {
            return this.writeSize;
        }

        public static final class Builder {
            private MemSeconds memSeconds; 
            private MemSecondsDayGrowthRatio memSecondsDayGrowthRatio; 
            private MemUtilization memUtilization; 
            private ReadSize readSize; 
            private VcoreSeconds vcoreSeconds; 
            private VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio; 
            private VcoreUtilization vcoreUtilization; 
            private WriteSize writeSize; 

            /**
             * MemSeconds.
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
                return this;
            }

            /**
             * MemSecondsDayGrowthRatio.
             */
            public Builder memSecondsDayGrowthRatio(MemSecondsDayGrowthRatio memSecondsDayGrowthRatio) {
                this.memSecondsDayGrowthRatio = memSecondsDayGrowthRatio;
                return this;
            }

            /**
             * MemUtilization.
             */
            public Builder memUtilization(MemUtilization memUtilization) {
                this.memUtilization = memUtilization;
                return this;
            }

            /**
             * ReadSize.
             */
            public Builder readSize(ReadSize readSize) {
                this.readSize = readSize;
                return this;
            }

            /**
             * VcoreSeconds.
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * VcoreSecondsDayGrowthRatio.
             */
            public Builder vcoreSecondsDayGrowthRatio(VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio) {
                this.vcoreSecondsDayGrowthRatio = vcoreSecondsDayGrowthRatio;
                return this;
            }

            /**
             * VcoreUtilization.
             */
            public Builder vcoreUtilization(VcoreUtilization vcoreUtilization) {
                this.vcoreUtilization = vcoreUtilization;
                return this;
            }

            /**
             * WriteSize.
             */
            public Builder writeSize(WriteSize writeSize) {
                this.writeSize = writeSize;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Analysis")
        private Analysis analysis;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("Metrics")
        private Metrics metrics;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.componentName = builder.componentName;
            this.metrics = builder.metrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public Analysis getAnalysis() {
            return this.analysis;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private Analysis analysis; 
            private String componentName; 
            private Metrics metrics; 

            /**
             * Analysis.
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
