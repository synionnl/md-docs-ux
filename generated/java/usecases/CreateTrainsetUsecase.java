interface CreateTrainsetUsecase {
    public void CreateTrainset(UUID commandId, UUID correlationId, UUID causationId, ComplexTrainset trainset)
}