package com.dtstack.flinkx.metadatavertica.entity;

import com.dtstack.metadata.rdb.core.entity.ColumnEntity;
import com.dtstack.metadata.rdb.core.entity.MetadatardbEntity;

import java.util.List;

/**
 * @company:www.dtstack.com
 * @Author:shiFang
 * @Date:2021-01-28 19:25
 * @Description:
 */
public class MetadataVerticaEntity extends MetadatardbEntity {

    /**字段集合*/
    private List<ColumnEntity> partitionColumns;

    public List<ColumnEntity> getPartitionColumns() {
        return partitionColumns;
    }

    public void setPartitionColumns(List<ColumnEntity> partitionColumns) {
        this.partitionColumns = partitionColumns;
    }

    @Override
    public String toString() {
        return "MetadataVerticaEntity{" +
                "partitionColumns=" + partitionColumns +
                ", tableProperties=" + tableProperties +
                ", columns=" + columns +
                ", tableName='" + tableName + '\'' +
                ", schema='" + schema + '\'' +
                ", querySuccess=" + querySuccess +
                ", errorMsg='" + errorMsg + '\'' +
                ", operaType='" + operaType + '\'' +
                '}';
    }
}
