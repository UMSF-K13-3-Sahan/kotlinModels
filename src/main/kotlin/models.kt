package profile.dal.models

data class Contact(
				val id: String,
				val first_name: String,
				val last_name: String,
				val phone: String,
				val email: String,
				val avatar: String = ""
)

data class LightClient(
				val id: String,
				val email: String,
				val first_name: String,
				val last_name: String
)

data class ClientProfile(
				val id: String
)