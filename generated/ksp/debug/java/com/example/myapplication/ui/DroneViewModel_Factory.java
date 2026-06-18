package com.example.myapplication.ui;

import com.example.myapplication.domain.repository.DroneRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DroneViewModel_Factory implements Factory<DroneViewModel> {
  private final Provider<DroneRepository> repositoryProvider;

  public DroneViewModel_Factory(Provider<DroneRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DroneViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static DroneViewModel_Factory create(Provider<DroneRepository> repositoryProvider) {
    return new DroneViewModel_Factory(repositoryProvider);
  }

  public static DroneViewModel newInstance(DroneRepository repository) {
    return new DroneViewModel(repository);
  }
}
