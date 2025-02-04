/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class SpaceBackupInfo implements TBase, java.io.Serializable, Cloneable, Comparable<SpaceBackupInfo> {
  private static final TStruct STRUCT_DESC = new TStruct("SpaceBackupInfo");
  private static final TField SPACE_FIELD_DESC = new TField("space", TType.STRUCT, (short)1);
  private static final TField PARTITION_INFO_FIELD_DESC = new TField("partition_info", TType.STRUCT, (short)2);
  private static final TField CP_DIRS_FIELD_DESC = new TField("cp_dirs", TType.LIST, (short)3);

  public SpaceDesc space;
  public com.vesoft.nebula.PartitionBackupInfo partition_info;
  public List<CheckpointInfo> cp_dirs;
  public static final int SPACE = 1;
  public static final int PARTITION_INFO = 2;
  public static final int CP_DIRS = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE, new FieldMetaData("space", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, SpaceDesc.class)));
    tmpMetaDataMap.put(PARTITION_INFO, new FieldMetaData("partition_info", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.PartitionBackupInfo.class)));
    tmpMetaDataMap.put(CP_DIRS, new FieldMetaData("cp_dirs", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, CheckpointInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(SpaceBackupInfo.class, metaDataMap);
  }

  public SpaceBackupInfo() {
  }

  public SpaceBackupInfo(
      SpaceDesc space,
      com.vesoft.nebula.PartitionBackupInfo partition_info,
      List<CheckpointInfo> cp_dirs) {
    this();
    this.space = space;
    this.partition_info = partition_info;
    this.cp_dirs = cp_dirs;
  }

  public static class Builder {
    private SpaceDesc space;
    private com.vesoft.nebula.PartitionBackupInfo partition_info;
    private List<CheckpointInfo> cp_dirs;

    public Builder() {
    }

    public Builder setSpace(final SpaceDesc space) {
      this.space = space;
      return this;
    }

    public Builder setPartition_info(final com.vesoft.nebula.PartitionBackupInfo partition_info) {
      this.partition_info = partition_info;
      return this;
    }

    public Builder setCp_dirs(final List<CheckpointInfo> cp_dirs) {
      this.cp_dirs = cp_dirs;
      return this;
    }

    public SpaceBackupInfo build() {
      SpaceBackupInfo result = new SpaceBackupInfo();
      result.setSpace(this.space);
      result.setPartition_info(this.partition_info);
      result.setCp_dirs(this.cp_dirs);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpaceBackupInfo(SpaceBackupInfo other) {
    if (other.isSetSpace()) {
      this.space = TBaseHelper.deepCopy(other.space);
    }
    if (other.isSetPartition_info()) {
      this.partition_info = TBaseHelper.deepCopy(other.partition_info);
    }
    if (other.isSetCp_dirs()) {
      this.cp_dirs = TBaseHelper.deepCopy(other.cp_dirs);
    }
  }

  public SpaceBackupInfo deepCopy() {
    return new SpaceBackupInfo(this);
  }

  public SpaceDesc getSpace() {
    return this.space;
  }

  public SpaceBackupInfo setSpace(SpaceDesc space) {
    this.space = space;
    return this;
  }

  public void unsetSpace() {
    this.space = null;
  }

  // Returns true if field space is set (has been assigned a value) and false otherwise
  public boolean isSetSpace() {
    return this.space != null;
  }

  public void setSpaceIsSet(boolean __value) {
    if (!__value) {
      this.space = null;
    }
  }

  public com.vesoft.nebula.PartitionBackupInfo getPartition_info() {
    return this.partition_info;
  }

  public SpaceBackupInfo setPartition_info(com.vesoft.nebula.PartitionBackupInfo partition_info) {
    this.partition_info = partition_info;
    return this;
  }

  public void unsetPartition_info() {
    this.partition_info = null;
  }

  // Returns true if field partition_info is set (has been assigned a value) and false otherwise
  public boolean isSetPartition_info() {
    return this.partition_info != null;
  }

  public void setPartition_infoIsSet(boolean __value) {
    if (!__value) {
      this.partition_info = null;
    }
  }

  public List<CheckpointInfo> getCp_dirs() {
    return this.cp_dirs;
  }

  public SpaceBackupInfo setCp_dirs(List<CheckpointInfo> cp_dirs) {
    this.cp_dirs = cp_dirs;
    return this;
  }

  public void unsetCp_dirs() {
    this.cp_dirs = null;
  }

  // Returns true if field cp_dirs is set (has been assigned a value) and false otherwise
  public boolean isSetCp_dirs() {
    return this.cp_dirs != null;
  }

  public void setCp_dirsIsSet(boolean __value) {
    if (!__value) {
      this.cp_dirs = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE:
      if (__value == null) {
        unsetSpace();
      } else {
        setSpace((SpaceDesc)__value);
      }
      break;

    case PARTITION_INFO:
      if (__value == null) {
        unsetPartition_info();
      } else {
        setPartition_info((com.vesoft.nebula.PartitionBackupInfo)__value);
      }
      break;

    case CP_DIRS:
      if (__value == null) {
        unsetCp_dirs();
      } else {
        setCp_dirs((List<CheckpointInfo>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE:
      return getSpace();

    case PARTITION_INFO:
      return getPartition_info();

    case CP_DIRS:
      return getCp_dirs();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof SpaceBackupInfo))
      return false;
    SpaceBackupInfo that = (SpaceBackupInfo)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetSpace(), that.isSetSpace(), this.space, that.space)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPartition_info(), that.isSetPartition_info(), this.partition_info, that.partition_info)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCp_dirs(), that.isSetCp_dirs(), this.cp_dirs, that.cp_dirs)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space, partition_info, cp_dirs});
  }

  @Override
  public int compareTo(SpaceBackupInfo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace()).compareTo(other.isSetSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space, other.space);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPartition_info()).compareTo(other.isSetPartition_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(partition_info, other.partition_info);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCp_dirs()).compareTo(other.isSetCp_dirs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(cp_dirs, other.cp_dirs);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case SPACE:
          if (__field.type == TType.STRUCT) {
            this.space = new SpaceDesc();
            this.space.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTITION_INFO:
          if (__field.type == TType.STRUCT) {
            this.partition_info = new com.vesoft.nebula.PartitionBackupInfo();
            this.partition_info.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CP_DIRS:
          if (__field.type == TType.LIST) {
            {
              TList _list237 = iprot.readListBegin();
              this.cp_dirs = new ArrayList<CheckpointInfo>(Math.max(0, _list237.size));
              for (int _i238 = 0; 
                   (_list237.size < 0) ? iprot.peekList() : (_i238 < _list237.size); 
                   ++_i238)
              {
                CheckpointInfo _elem239;
                _elem239 = new CheckpointInfo();
                _elem239.read(iprot);
                this.cp_dirs.add(_elem239);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.space != null) {
      oprot.writeFieldBegin(SPACE_FIELD_DESC);
      this.space.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.partition_info != null) {
      oprot.writeFieldBegin(PARTITION_INFO_FIELD_DESC);
      this.partition_info.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.cp_dirs != null) {
      oprot.writeFieldBegin(CP_DIRS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.cp_dirs.size()));
        for (CheckpointInfo _iter240 : this.cp_dirs)        {
          _iter240.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("SpaceBackupInfo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getSpace() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getSpace(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("partition_info");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getPartition_info() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getPartition_info(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("cp_dirs");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCp_dirs() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getCp_dirs(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

