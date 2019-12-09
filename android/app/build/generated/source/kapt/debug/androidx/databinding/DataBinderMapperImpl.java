package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new codes.stable.opensource.android.DataBinderMapperImpl());
  }
}
