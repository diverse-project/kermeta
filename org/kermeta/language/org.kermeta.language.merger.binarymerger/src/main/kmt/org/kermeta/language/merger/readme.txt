The kmt file at this level of the folder are here only for history.
The main binary merger that need to be compiled is in binarymerger/km_BinaryMerger.kmt

The current BinaryMergerGenerator generates only one pass. but in the general case (ie. for model with more cross references)
we need to work with several passes.  the classes here are an attempt in a multipass merger. The concept should be transfered to the MergerGenerator