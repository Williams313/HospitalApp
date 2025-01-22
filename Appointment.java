class Doctor extends Person {
    private String specialization;
    private List<String> qualifications;
    private Map<LocalDateTime, Boolean> availability;
    private List<Appointment> appointments;

    public Doctor(String name, String contactNumber, String email, String address,
                  String specialization, List<String> qualifications) {
        super(name, contactNumber, email, address);
        this.specialization = specialization;
        this.qualifications = qualifications;
        this.availability = new HashMap<>();
        this.appointments = new ArrayList<>();
    }

    public Map<LocalDateTime, Boolean> getAvailability() {
        return new HashMap<>(availability);
    }

    public void updateAvailability(LocalDateTime dateTime, boolean isAvailable) {
        availability.put(dateTime, isAvailable);
    }

    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointments);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}