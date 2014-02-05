class UrlMappings {

	static mappings = {
		"/ajax/instrumentTypes/save"(controller: "instrumentTypes", parseRequest: true) {
		   action = [POST: "save"]
		}
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
