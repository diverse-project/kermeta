Technically this should not  be in this bundle because API isn't supposed to be dependent of art2.framework


a better place should be a separate language.api.art2.utils artifact
that will be a helper on ART2 port for the API


DVK : to go fast, I haven't done it yet, and put the classes directly in the API 
 because it currently depends on art2.framework (and I think this dependency must be removed in the future)  